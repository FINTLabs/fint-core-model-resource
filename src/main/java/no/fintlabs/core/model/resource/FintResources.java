package no.fintlabs.core.model.resource;

import com.fasterxml.jackson.core.type.TypeReference;

import java.util.List;

public class FintResources extends AbstractCollectionResources<FintResource> {

    @Override
    public TypeReference<List<FintResource>> getTypeReference() {
        return null;
    }

}
