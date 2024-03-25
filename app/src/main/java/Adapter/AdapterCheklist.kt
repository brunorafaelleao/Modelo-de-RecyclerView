package Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.R
import com.example.recyclerview.modelo.Checklist

/*Esse adapter vai herdar as características de um RecycleView
e vamos passar as caracterísricas de um Adapter.
O Adapter espera um ViewHolder (a propria visualização da recyclerview) e
criaremos ele do zero. Nesse exemplo, chamaremos de ChecklistViewHolder
 */
class AdapterCheklist(private val context: Context, private val checklist: MutableList<Checklist>): RecyclerView.Adapter<AdapterCheklist.ChecklistViewHolder>() {
/*É preciso criar uma classe para o ChecklistViewHolder.
Por ser uma class interna dentro de outra classe, será chamada inner class
*/
    inner class ChecklistViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        //inicar as variáveis do layout recuperando os ids do xml desse layout. Antes do findView, colocar itemView
        val foto = itemView.findViewById<ImageView>(R.id.imgChecklist)
        val mensagem = itemView.findViewById<TextView>(R.id.txtTextoCheck)
        val check = itemView.findViewById<CheckBox>(R.id.id_checkBox)


    }
/*inner class ChecklistViewHolder herdará as as características de um RecycleView
e deve pegar a classe nativa ViewHolder que cria as visualizações
terminado de criar a inner class, pressionar alt+enter em ChecklistViewHolder para
passar o adapterProduto para o ChecklistViewHolder:
RecyclerView.Adapter<AdapterCheklist.ChecklistViewHolder>
Depois desse processo, também precisa criar o construtor da inner
inner class ChecklistViewHolder: RecyclerView.ViewHolder() e em seguida adicionar os parametros
para o inner class inner class clicando com o botao direito ChecklistViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
- Após adicionar o itemView, implementar os métodos da classe AdapterCheklist clicando
com o botão direito. os método são: onCreateViewHolder, getItemCount e onBindViewHolder
- Com os métodos criados, atualizá-los com as variáveis
 */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChecklistViewHolder {
/*esse método vai criar a visualização na tela.
Criar uma variável que receba um LayoutInflater com o método from(). Como ele pede
um contexto pra ficar from(context), inserir esse contexto na class AdapterChecklist criando um construtor:
class AdapterCheklist(private val context: Context)
Criando o contexto, usar o método inflate e usar como parametro o R.layout."nome do xml do layout".

 */
        val itemLista = LayoutInflater.from(context).inflate(R.layout.item_rvdenguelist,parent,false)
    /*após criar a variável itemLista, criar uma segunda variável que chamaremos de holder
    ela recebe como valor o inner class ChecklistViewHolder e o parâmetro vai ser a variavel itemLista e ao final,
    inserir o return holder
     */
        val holder = ChecklistViewHolder(itemLista)
        return holder

    }
    override fun onBindViewHolder(holder: ChecklistViewHolder, position: Int) {
        /*método que vai exibir as visualizações da lista.
        Antes de inciar aqui, certificar de que as varíaveis dos itens do layout estão inicializadas
        no inner class.
        Inicalizadas, vamos inserir a propriedade holder que já tem o item de lista CheckListViewHolder
         e para cada item a ser carregado, inserir holder."nome do item"."set de acordo com a propriedade
         Antes, verificar se dentro do construtor da AdapterChekList existe uma variável que traga uma lista
         mutável e essa lista esteja numa classe dos itens.
         exemplo: class AdapterCheklist(private val context: Context, private val produtos: MutableList<Cheklist>)
         Nesse caso, os atributos dos itens estão na classe CheckList que criamos no pacote modelo*/
        holder.foto.setImageResource(checklist[position].foto)
        //ele vai carregar a foto a partir da classe checklist e na posição de cada imagem

        holder.mensagem.text = checklist[position].mensagem
        //ele vai carregar a mensagem a partir da classe checklist e na posição de cada mensagem

        holder.check.isChecked = checklist[position].check
        //ele vai carregar um checkbox a partir da classe checklist e na posição de cada um deles


    }

    //esse método receberá o tamanho total da lista
    override fun getItemCount(): Int = checklist.size






}