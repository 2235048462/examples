package Exception;

class CustomizeException {
    public static void main ( String[] args ) {
        try {
            new Input ().method ();
        } catch (WrongInputException e) {
            System.out.println ( e.getMessage () );
        }
    }
}

class WrongInputException extends Exception { //�Զ������
    WrongInputException ( String s ) {
        super ( s );
    }
}

class Input {
    void method () throws WrongInputException {
        throw new WrongInputException ( "Wrong input" );// �׳��Զ������
    }
}
