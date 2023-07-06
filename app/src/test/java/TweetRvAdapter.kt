package dev

//import androidx.recyclerview.widget.RecyclerView
//import androidx.recyclerview.widget.RecyclerView.ViewHolder
//import com.example.twitterclone.databinding.ActivityMainBinding
//import com.example.twitterclone.databinding.TweetListItemBinding
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.twitterclone.databinding.TweetListItemBinding



class TweetRvAdapter(var ContactList:List<TweetData>) : RecyclerView.Adapter<ContactViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        val binding =
            TweetListItemBinding .inflate(LayoutInflater.from(parent.context),parent ,false)
        return ContactViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        var currentContact =ContactList.get(position)
        var  binding=holder.binding
        binding.tilName.text=currentContact.Name
        binding.tilPhoneNumber.text=currentContact.PhoneNumber.toString()
        binding.tilEmail.text =currentContact.Email
    }
    override fun getItemCount(): Int {
        return ContactList.size
    }
}
        class ContactViewHolder( var binding:TweetListItemBinding):ViewHolder(binding.root)
