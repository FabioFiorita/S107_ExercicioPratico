sudo apt install mailutils
mail -s 'Situação do Pipeline' "$EMAIL" <<< 'Pipeline executado com sucesso!'
