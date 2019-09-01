package com.services.dependenciesexplorer.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Application {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name="groupName")
    private @NonNull String group;
    private @NonNull String artifact;

    @ElementCollection
    @CollectionTable(name="Dependencies", joinColumns=@JoinColumn(name="id"))
    @Column(name="dependency")
    private @NonNull List<String> dependencies;

}


