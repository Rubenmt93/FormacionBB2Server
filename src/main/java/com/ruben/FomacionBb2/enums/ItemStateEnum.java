package com.ruben.FomacionBb2.enums;

public enum ItemStateEnum {
    Activo(1,"Activo"),
    Descontinuado(2,"Descontinuado");
    Integer id;
    String estado;
    private ItemStateEnum(Integer id, String estado){
        this.id= id;
        this.estado= estado;
    }
    public Integer getId(){
        return id;
    }

    public static ItemStateEnum getFromId(Integer id){
        for(ItemStateEnum e : values()) {
            if(e.id.equals(id))
                return e;
        }
        return null;
    }
}
