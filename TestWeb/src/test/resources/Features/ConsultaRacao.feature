Feature: Consultar produto site Petz
  Scenario: Consulta por Racao
    Given Acesso o site
    When Consulta o terceiro produto retornado da busca
    Then Valida nome do produto, fornecedor, preco normal e precoassinante
    And Insire o produto no carrinho de compras
    And Valide se os dados do item tres continuam identicos
