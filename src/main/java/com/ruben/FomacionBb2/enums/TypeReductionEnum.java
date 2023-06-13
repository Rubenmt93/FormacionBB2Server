package com.ruben.FomacionBb2.enums;

public enum TypeReductionEnum {
    Porcentual(1,"Porcentual"),
    CantidadFija(2,"CantidadFija"),
    CambioDePrecio(3,"CambioDePrecio");
    Integer id;
    String estado;
    private TypeReductionEnum(Integer id, String estado){
        this.id= id;
        this.estado= estado;
    }
    public Integer getId(){
        return id;
    }

    public static TypeReductionEnum getFromId(Integer id){
        for(TypeReductionEnum e : values()) {
            if(e.id.equals(id))
                return e;
        }
        return null;
    }
}
