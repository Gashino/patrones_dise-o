package facade;

import static facade.menuFacade.calendario;

public class timeController {
    public static void proximoDia(){
        calendario.notificar();
        calendario.sumarDia();
    }
}
