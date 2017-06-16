/* Copyright 2017 freecodeformat.com */
package com.example.eleazer.desafiomobfiq.modelos;
import com.google.gson.annotations.SerializedName;

import java.util.List;
/* Time: 2017-06-16 18:31:8 @author freecodeformat.com @website http://www.freecodeformat.com/json2javabean.php */
public class Specifications {

    @SerializedName("Comunicação")
    private List<String> comunicação;
    @SerializedName("Peso e Dimensões")
    private List<String> pesoDimensões;
    @SerializedName("Outros Detalhes")
    private List<String> outrosDetalhes;
    @SerializedName("Garantia do Fabricante")
    private List<String> garantiaDoFabricante;
    @SerializedName("Composição")
    private List<String> composição;
    @SerializedName("Itens Inclusos")
    private List<String> itensInclusos;
    @SerializedName("Grátis / Brinde")
    private List<String> grátisBrinde;
    @SerializedName("Tutoriais")
    private List<String> tutoriais;

    public void setComunicação(List<String> comunicação) {
         this.comunicação = comunicação;
     }
     public List<String> getComunicação() {
         return comunicação;
     }

    public List<String> getPesoDimensões() {
        return pesoDimensões;
    }

    public void setPesoDimensões(List<String> pesoDimensões) {
        this.pesoDimensões = pesoDimensões;
    }

    public void setComposição(List<String> composição) {
         this.composição = composição;
     }
     public List<String> getComposição() {
         return composição;
     }

    public void setTutoriais(List<String> tutoriais) {
         this.tutoriais = tutoriais;
     }
     public List<String> getTutoriais() {
         return tutoriais;
     }

}