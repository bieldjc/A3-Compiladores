/**
 * Enumeração de tipos de tokens da linguagem
 */
public enum TokenType {
    // Palavras reservadas
    INT("int"),
    FLOAT("float"),
    STRING("string"),
    IF("if"),
    ELSE("else"),
    WHILE("while"),
    FOR("for"),
    READ("read"),
    PRINT("print"),
    
    // Identificadores e literais
    ID("ID"),
    NUMBER("NUMBER"),
    STRING_LITERAL("STRING_LITERAL"),
    
    // Operadores aritméticos
    PLUS("+"),
    MINUS("-"),
    MULT("*"),
    DIV("/"),
    MOD("%"),
    
    // Operadores relacionais
    EQ("=="),
    NEQ("!="),
    LT("<"),
    GT(">"),
    LTE("<="),
    GTE(">="),
    
    // Operadores lógicos
    AND("&&"),
    OR("||"),
    NOT("!"),
    
    // Atribuição
    ASSIGN("="),
    
    // Delimitadores
    LPAREN("("),
    RPAREN(")"),
    LBRACE("{"),
    RBRACE("}"),
    SEMICOLON(";"),
    COMMA(","),
    
    // Especiais
    EOF("EOF");
    
    private final String value;
    
    TokenType(String value) {
        this.value = value;
    }
    
    public String getValue() {
        return value;
    }
    
    @Override
    public String toString() {
        return value;
    }
}
