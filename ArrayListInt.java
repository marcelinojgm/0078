
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
        if(index < list.length && index >= 0)
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
        for (int index = 0; index < list.length && !contains; index++ )
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
        if(index < list.length && index >= 0)
        {
            num = list[index];
        }
        else
        {
            num = -1;
        }	
        return num;
    }

    /**
     * sustitulle el valor del elemento del indice seleccionado
     */
    public void set(int index, int num)
    {
        if(index < list.length && index >= 0)
        {
            list[index] = num;
        }
    }

    /**
     * devuelve el indice en el que aparece la primera ocurrencia 
     * del elemento especificado o -1 
     * en caso de que la colección no contenga el elemento 
     * especificado.
     */
    public int indexOf(int num)
    {
        int index = 0;
        //recorrido en busca del elemento en caso de que exita
        if(contains(num))
        {
            boolean contains = false;
            //recorrido en busca del elemento
            for (int i = 0; i < list.length && !contains; i++ )
            {
                if (list[i]== num)
                {
                    //marcado como encontrado y guardado del indice
                    contains = true;
                    index = i;
                }
            }

        }
        //en caso de que no exista el elemento
        else
        {
            index = -1;
        }

        return index;
    }

    /**
     * devuelve true si la lista no contiene elementos.
     */
    public boolean isEmpty()
    {
        //inicializamos como si tuvieramos elementos
        boolean isEmpty = false;
        //sie esta vacio
        if(list.length == 0)
        {
            isEmpty = true;
        }
        return isEmpty;
    }

    /**
     * elimina de la colección el elemento 
     * que ocupa la posición especificada 
     * y devuelve dicho elemento. 
     * Si el valor de index no es válido,
     * no hace nada y devuelve -1.
     */
    public int remove(int index)
    {

        int num = 0;
        int[] newList = new int[list.length - 1]; 
        //indice valido
        if(index < list.length && index >= 0)
        {

            //guardado de elementos en las posiciones anteriores a la indicada
            for (int i = 0;   i != index; i++ )
            {
                newList[i] = list[i]; 
            }

            //guardado para el retorno del elemento que se borra
            //no es guardado en la nuava lista
            num = list[index];

            //agregado de elementos despues de la posicion indicada
            for (int i = index+1; i < list.length;  i++ )
            {
                newList[i-1] = list[i];
            }

            //guardado de la nueva lista
            list = newList;

        }
        //inidice invalido

        else
        {
            num = -1;
        }

        return num;
    }

    /**
     * devuelve el número de elementos de la colección.
     */
    public int size()
    {
        return list.length;
    }
}
