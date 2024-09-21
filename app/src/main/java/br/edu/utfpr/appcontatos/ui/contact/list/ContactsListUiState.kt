package br.edu.utfpr.appcontatos.ui.contact.list

import br.edu.utfpr.appcontatos.data.Contact

data class ContactsListUiState(
    val isLoading: Boolean = false,
    var hasError: Boolean = false,
    var contacts: Map<String, List<Contact>> = mapOf()
)
