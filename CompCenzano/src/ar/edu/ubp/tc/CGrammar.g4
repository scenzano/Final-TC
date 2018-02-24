/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

grammar CGrammar;

/* LEXER RULES */

CARACTER_LLAVE_ABRE:'{';
CARACTER_LLAVE_CIERRA:'}';

CARACTER_PARENTESIS_ABRE:'(';
CARACTER_PARENTESIS_CIERRA:')';

TIPO_DATO_INT: 'int ';
TIPO_DATO_DOUBLE: 'double ';
TIPO_DATO_FLOAT: 'float ';
TIPO_DATO_CHAR: 'char ';
TIPO_DATO_STRING : 'string ';
TIPO_DATO_VOID : 'void ';


ESTRUCTURA_IF:'if';
ESTRUCTURA_ELSE:'else';
ESTRUCTURA_FOR: 'for';
ESTRUCTURA_WHILE:'while';

INSTRUCCION_RETURN : 'return ';

fragment LETRA: [a-zA-Z];
fragment DIGITO:[0-9];

ID: (LETRA|'_')(LETRA | DIGITO | '_')*;

VALORNULL :'null';

NUMERO : DIGITO+('.'DIGITO+)?;

STRING : '\"'(~'\"')*'\"';


//CARACTER_NEGACION:'!';

COMPARADOR_IGUAL : '==';
COMPARADOR_DISTINTO : '!=';
COMPARADOR_MAYOR : '>';
COMPARADOR_MENOR : '<';
COMPARADOR_MAYOR_IGUAL : '>=';
COMPARADOR_MENOR_IGUAL : '<=';

OPERADOR_ASIGNACION : '=';
OPERADOR_SUMA : '+';
OPERADOR_RESTA : '-';
OPERADOR_PRODUCTO : '*';
OPERADOR_DIVISION : '/';

OPERADOR_SUMA_COMPUESTA : '+=';
OPERADOR_RESTA_COMPUESTA : '-=';
OPERADOR_PRODUCTO_COMPUESTO : '*=';
OPERADOR_DIVISION_COMPUESTA : '/=';

OPERADOR_INCREMENTO : '++';
OPERADOR_DECREMENTO : '--';

OPERADOR_AND : '&&';
OPERADOR_OR : '||';


SIGNO_COMA : ',';
SIGNO_PUNTO : '.';
SIGNO_PUNTO_Y_COMA : ';';

/* For whitespace skiping */
WS:[ \n\r\t]->skip;

/* PARSER RULES */

programa: instrucciones;

instrucciones: declaracion_variable instrucciones
             | declaracion_funcion instrucciones
             | asignacion instrucciones
             | llamada_funcion instrucciones
             | estructura_control instrucciones
             | retorno instrucciones
             |
             ;


termino_matematico: valor lista_expresiones_matematicas
                  | CARACTER_PARENTESIS_ABRE termino_matematico CARACTER_PARENTESIS_CIERRA lista_expresiones_matematicas //Cubre balance parentesis en expresiones matematicas.
                  |
                  ;

lista_expresiones_matematicas : OPERADOR_SUMA termino_matematico
                              | OPERADOR_RESTA termino_matematico
                              | OPERADOR_PRODUCTO termino_matematico
                              | OPERADOR_DIVISION termino_matematico
                              |
                              ;


declaracion_variable: tipo_dato ID declaraciones_asignacion SIGNO_PUNTO_Y_COMA
             ;


declaraciones_asignacion : OPERADOR_ASIGNACION termino_matematico declaraciones_asignacion
                         | SIGNO_COMA ID declaraciones_asignacion
                         |
                         ;

//ExpresionParentesis: CARACTER_PARENTESIS_ABRE (ExpresionParentesis | Expression) CARACTER_PARENTESIS_CIERRA ;

declaracion_funcion : tipo_dato ID CARACTER_PARENTESIS_ABRE parametros_en_declaracion CARACTER_PARENTESIS_CIERRA SIGNO_PUNTO_Y_COMA
                    | tipo_dato ID CARACTER_PARENTESIS_ABRE parametros_en_declaracion CARACTER_PARENTESIS_CIERRA bloque_instrucciones
                    ;


parametros_en_declaracion : tipo_dato ID lista_parametros_en_declaracion
                          | CARACTER_PARENTESIS_ABRE parametros_en_declaracion CARACTER_PARENTESIS_CIERRA lista_parametros_en_declaracion //Cubre balance parentesis en expresiones matematicas.
                          |
                          ;

lista_parametros_en_declaracion : SIGNO_COMA tipo_dato ID lista_parametros_en_declaracion
                                | SIGNO_COMA CARACTER_PARENTESIS_ABRE lista_parametros_en_declaracion CARACTER_PARENTESIS_CIERRA //Cubre balance parentesis en expresiones matematicas.
                                |
                                ;


llamada_funcion : valor_funcion SIGNO_PUNTO_Y_COMA
                ;

valor_funcion : ID CARACTER_PARENTESIS_ABRE parametros_en_llamada CARACTER_PARENTESIS_CIERRA
              ;

parametros_en_llamada : valor lista_parametros_en_llamada
                      | CARACTER_PARENTESIS_ABRE parametros_en_llamada CARACTER_PARENTESIS_CIERRA lista_parametros_en_llamada //Cubre balance parentesis en expresiones matematicas.
                      |
                      ;

lista_parametros_en_llamada : SIGNO_COMA valor lista_parametros_en_llamada
                            | SIGNO_COMA CARACTER_PARENTESIS_ABRE lista_parametros_en_llamada CARACTER_PARENTESIS_CIERRA //Cubre balance parentesis en expresiones matematicas.
                            |
                            ;

bloque_instrucciones : CARACTER_LLAVE_ABRE instrucciones CARACTER_LLAVE_CIERRA
                     ;


valor: NUMERO
     | ID
     | STRING
     | VALORNULL
     | VALOR_NULO
     | valor_funcion
     ;

tipo_dato : TIPO_DATO_INT 
          | TIPO_DATO_FLOAT 
          | TIPO_DATO_DOUBLE 
          | TIPO_DATO_STRING
          | TIPO_DATO_VOID
          | TIPO_DATO_CHAR
          | TIPO_DATO_STRING
          ;

retorno : INSTRUCCION_RETURN SIGNO_PUNTO_Y_COMA
        | INSTRUCCION_RETURN valor SIGNO_PUNTO_Y_COMA
        | INSTRUCCION_RETURN termino_matematico SIGNO_PUNTO_Y_COMA
        ;

asignacion : ID OPERADOR_ASIGNACION termino_matematico SIGNO_PUNTO_Y_COMA
           | ID operador_asignacion_compuesta termino_matematico SIGNO_PUNTO_Y_COMA
           | ID operador_incremento_decremento SIGNO_PUNTO_Y_COMA
           ;

operador_incremento_decremento : OPERADOR_INCREMENTO
                               | OPERADOR_DECREMENTO
                               ;

for_asignacion : ID OPERADOR_ASIGNACION termino_matematico for_lista_asignaciones
               | ID operador_asignacion_compuesta termino_matematico for_lista_asignaciones
               | ID operador_incremento_decremento for_lista_asignaciones
               |
               ;

for_lista_asignaciones : SIGNO_COMA ID OPERADOR_ASIGNACION termino_matematico for_lista_asignaciones
                       | SIGNO_COMA ID operador_asignacion_compuesta termino_matematico for_lista_asignaciones
                       | SIGNO_COMA ID operador_incremento_decremento for_lista_asignaciones
                       |
                       ;

operador_asignacion_compuesta : OPERADOR_SUMA_COMPUESTA
                              | OPERADOR_RESTA_COMPUESTA
                              | OPERADOR_PRODUCTO_COMPUESTO
                              | OPERADOR_DIVISION_COMPUESTA
                              ;

estructura_control : estructura_control_if
                   | estructura_control_for
                   | estructura_control_while
                   ;

estructura_control_if : ESTRUCTURA_IF CARACTER_PARENTESIS_ABRE expresion_logica CARACTER_PARENTESIS_CIERRA bloque_instrucciones estructura_control_else
                      ;

estructura_control_else : ESTRUCTURA_ELSE bloque_instrucciones
                        |
                        ;

expresion_logica : termino_logico lista_expresiones_logicas
                 ;

lista_expresiones_logicas : OPERADOR_AND expresion_logica
                          | OPERADOR_OR expresion_logica
                          |
                          ;

termino_logico : termino_matematico lista_terminos_logicos
               | CARACTER_PARENTESIS_ABRE expresion_logica CARACTER_PARENTESIS_CIERRA lista_terminos_logicos
               ;

lista_terminos_logicos : COMPARADOR_IGUAL termino_matematico
                       | COMPARADOR_DISTINTO termino_matematico
                       | COMPARADOR_MAYOR termino_matematico
                       | COMPARADOR_MENOR termino_matematico
                       | COMPARADOR_MAYOR_IGUAL termino_matematico
                       | COMPARADOR_MENOR_IGUAL termino_matematico
                       | 
                       ;

estructura_control_for : ESTRUCTURA_FOR CARACTER_PARENTESIS_ABRE  for_asignacion SIGNO_PUNTO_Y_COMA expresion_logica SIGNO_PUNTO_Y_COMA for_asignacion CARACTER_PARENTESIS_CIERRA bloque_instrucciones
                       ;

estructura_control_while : ESTRUCTURA_WHILE CARACTER_PARENTESIS_ABRE expresion_logica CARACTER_PARENTESIS_CIERRA bloque_instrucciones
                         ;
