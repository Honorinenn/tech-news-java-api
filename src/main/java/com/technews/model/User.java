package com.technews.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@JsonIgnoreProperities({"hibernateLazyInitializer", "handler"})
@Table(name = "user")
public class User {
}
