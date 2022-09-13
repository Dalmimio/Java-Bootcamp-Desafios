package interfaces;

import Entity.*;

public interface NumeroProducto {
    default Integer getNumeroGenerado(){
        //de que clase vienen??
        if (this.getClass() == Cuenta.class){
            Cuenta cuenta = (Cuenta) this;
            switch (cuenta.getTipo().toUpperCase()) {
                case "CC":
                    return Producto.NUMERO_CC++;
                case "CA":
                    return Producto.NUMERO_CA++;
                default:
                    break;
                }
        }else if(this.getClass() == TarjCredito.class){
            return Producto.NUMERO_TC++;
        }
        return null;
    }
}
