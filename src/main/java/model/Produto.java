package model;

import com.opencsv.bean.CsvBindByName;

import java.math.BigDecimal;

public class Produto {

    @CsvBindByName(column = "ProductId", required = true)
    private Integer idProduto;

    @CsvBindByName(column = "ProductName", required = true)
    private String nomeProduto;

    @CsvBindByName(column = "Description", required = true)
    private String descricaoProduto;

    @CsvBindByName(column = "Price", required = true)
    private BigDecimal precoProduto;

    @CsvBindByName(column = "Category", required = true)
    private String categoriaProduto;


    public Produto() {
    }

    public Produto(Integer idProduto, String nomeProduto, String descricaoProduto, BigDecimal precoProduto, String categoriaProduto) {
        this.idProduto = idProduto;
        this.nomeProduto = nomeProduto;
        this.descricaoProduto = descricaoProduto;
        this.precoProduto = precoProduto;
        this.categoriaProduto = categoriaProduto;
    }

    public Integer getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Integer idProduto) {
        this.idProduto = idProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }

    public BigDecimal getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(BigDecimal precoProduto) {
        this.precoProduto = precoProduto;
    }

    public String getCategoriaProduto() {
        return categoriaProduto;
    }

    public void setCategoriaProduto(String categoriaProduto) {
        this.categoriaProduto = categoriaProduto;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "idProduto=" + idProduto +
                ", nomeProduto='" + nomeProduto + '\'' +
                ", descricaoProduto='" + descricaoProduto + '\'' +
                ", precoProduto=" + precoProduto +
                ", categoriaProduto='" + categoriaProduto + '\'' +
                '}';
    }
}
