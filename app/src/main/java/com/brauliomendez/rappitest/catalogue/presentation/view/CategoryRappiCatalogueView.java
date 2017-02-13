package com.brauliomendez.rappitest.catalogue.presentation.view;

import com.brauliomendez.rappitest.catalogue.domain.entity.Entry;

import java.util.List;

/**
 * Created by BraulioMendez on 2/11/17.
 */

public interface CategoryRappiCatalogueView {

    void showItems(List<Entry> entries);

    void onCategoryRappiCatalogueError(String message);
}
