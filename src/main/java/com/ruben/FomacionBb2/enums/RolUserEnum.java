package com.ruben.FomacionBb2.enums;

public enum RolUserEnum {
    Usuario(1,"Usuario"),
    Administrador(2,"Administrador");
    Integer id;
    String rol;
    private RolUserEnum(Integer id, String estado){
        this.id= id;
        this.rol= estado;
    }
    public Integer getId(){
        return id;
    }

    public static RolUserEnum getFromId(Integer id){
        for(RolUserEnum e : values()) {
            if(e.id.equals(id))
                return e;
        }
        return null;
    }
}
