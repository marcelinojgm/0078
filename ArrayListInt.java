
/**
 * Write a description of class ArrayListInt here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ArrayListInt
{
    // instance variables - replace the example below with your own
    private int[] list;

    /**
     * Constructor for objects of class ArrayListInt
     */
    public ArrayListInt()
    {
        list = new int[0];
    }

    /**
     * añade otro elemento a la lista
     */

    public void add(int num)
    {
        //nueva lista creada
        int[] newList = new int[list.length + 1];
        //copiado de lista antigua en la nueva
        for (int index = 0; index < list.length; index++ )
        {
            newList[index] = list[index];
        }
        //agregado de nuevo elemento en la nueva lista
        newList[list.length] = num;

        //guardado de la nueva lista
        list = newList;
    }

    /**
     * introduce un int num en la posicion indicada index
     */
    public void add(int index, int num)
    {
        int[] newList = new int[list.length + 1]; 
        if(index < list.length)
        {
            //guardado de elementos en las posiciones anteriores a la indicada
            for (int i = 0;   i != index; i++ )
            {
                newList[i] = list[i];
            }
            //insercion de nuevo elemento en la posicion indicada
            newList[index] = num;
            //agregado de elementos despues de la posicion indicada
            for (int i = index; i < list.length;  i++ )
            {
                newList[i  + 1] = list[i];
            }

            //guardado de la nueva lista
            list = newList;
        }
    }

    /**
     * vacia la coleecion
     */
    public void clear()
    {
        list = new int[0];
    }

    /**
     * devuelve true si la colección contiene ese elemento.
     */
    public boolean contains(int num)
    { boolean contains = false;
        //recorrido en busca del elemento
        for (int index = 0; index < list.length; index++ )
        {
            if (list[index]== num)
            {
                contains = true;
            }
        }
        return contains;
    }

    /**
     * devuelve el elemento existente en la indice indicado.
     * -1 si la posicion no es correcta
     */
    public int get(int index)
    {
        int num;
        if(index < list.length)
        {
            num = list[index];
        }
        else
        {
            num = -1;
        }	
        return num;
    }

}
