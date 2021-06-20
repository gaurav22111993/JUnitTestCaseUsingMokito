package com.example.JUnitTestCaseUsingMokito.entity.compositeKey;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "composite_demo")

/* Composite key means we can use two or more colume as primary key.
in this example s_id and s_name we are using as composite key.
for this we created saperate class for it
 */

public class MainEntity {
    @EmbeddedId
    private CompositeKey compositeKey;
    private String email;
    private String password;

}
