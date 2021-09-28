import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.todo.R
import com.example.todo.Todolist
import kotlinx.android.synthetic.main.card_list.view.*


class TodoAdapter (
    var todos : List<Todolist>
        ) : RecyclerView.Adapter<TodoAdapter.TodoViewHolder> () {

    inner class TodoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodoViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.card_list ,parent, false)
        return TodoViewHolder(view)

    }

    override fun getItemCount(): Int {
        return todos.size


    }

    override fun onBindViewHolder(holder: TodoViewHolder, position: Int) {
        holder.itemView.apply {

            main.text = todos[position].note
            tickmark.isChecked = todos[position].isTicked
        }



    }


}