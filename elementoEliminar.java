@Override

public void eliminarElemento(Object elementoaEliminar){
    if(estaVacia()){
        System.out.println((":(no se puede eliminar: )" +elementoaEliminar+ ",la lista esta vacia."));
        return;
    }

    if(cabeza.getDato().equals(elementoaEliminar)){
        cabeza = cabeza.getEnlace();
        System.out.println(":) elemento " + elementoaEliminar + ", eliminado de la lista");
        return;
    }

    Nodo auxNodo = cabeza;
    while (auxNodo.getEnlace() != null) {
        if(auxNodo.getEnlace().getDato.equals(elementoaEliminar)){
            auxNodo.setEnlace(auxNodo.getEnlace().getEnlace());
            System.out.println(": Elemento " + elementoaEliminar + ", eliminado de la lista" );
            return;
        }

        auxNodo = auxNodo.getEnlace();
        }
        System.out.println(":) el elemento " + elementoaEliminar + ", no se encuentra en la lista");;
}