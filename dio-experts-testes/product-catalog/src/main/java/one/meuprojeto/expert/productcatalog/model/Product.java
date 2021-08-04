package one.meuprojeto.expert.productcatalog.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
@Getter
@Setter
@Document(indexName = "product", type = "catalog")

public class Product {
    @Id// especificando o campo como id unico
    private Long id;
  private String name;
  private Integer among;


}
