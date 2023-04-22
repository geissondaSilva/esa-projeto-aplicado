package br.com.geisson.esa;

import javax.enterprise.context.ApplicationScoped;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

@ApplicationScoped
public class CacheService {

    private static final Logger LOG = Logger.getLogger(ExemploResource.class.getName());

    private final List<String> cached = new ArrayList<>();

    public void add(String value) {
        cached.add(value);
        LOG.info("Add: " + value + " total itens: " + cached.size());
    }

}
