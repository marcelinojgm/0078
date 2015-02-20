
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
         //nueva lista creada
         if(index < list.length)
         {
             list[index] = num;
         }
    }


}
