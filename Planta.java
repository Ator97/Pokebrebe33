
package pokeprebe;

/**
 *
 * @author Oscar Gutiérrez Castillo
 */
class  Planta extends Hierba{

    /**
    *@param nivel nivel dado por el usuario para definir los status del monstruo
    *@param apodo nombre que le da el usuario, solo sirve para personalizar
    */

    public Planta(int nivel, String apodo) {
        super(nivel, apodo);
    }

    /**
    *@param nivel nivel dado por el usuario para definir los status del monstruo
    */
    public Planta(int nivel) {
        super(nivel,"Planta");
    }    

    /**
    *@param m Por polimorfismo afectamos directamente el status de vida del monstruo a atacar
    */
    @Override
    public String ataque2(Monstruo m) {
        float danio = (float) (getAtaque() -  m.getDefensa() * 1.5);
            if (danio <= 0){
		return "parece que no ha habido daño alguno";
           }
	m.recibirDanio(danio);
        return null;
    }
 

}