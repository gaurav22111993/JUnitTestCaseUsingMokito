package com.example.JUnitTestCaseUsingMokito.entity.compositeKey;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Embeddable
public class CompositeKey implements Serializable {

    private int  s_id;
    private  String s_name;
}
