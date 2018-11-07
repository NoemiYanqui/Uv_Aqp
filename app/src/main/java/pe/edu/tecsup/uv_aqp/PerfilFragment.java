package pe.edu.tecsup.uv_aqp;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

public class PerfilFragment extends Fragment  {

    public static final int MSexo = 1;
    public static final int MPiel = 2;

        public ImageView fotoPerfil;
        ListView lista1;

        @Nullable
        @Override
        public View onCreateView (@NonNull LayoutInflater inflater, @Nullable ViewGroup
        container, @Nullable Bundle savedInstanceState){
            View view=inflater.inflate(R.layout.fragment_perfil, container, false);

        lista1 = (ListView) view.findViewById(R.id.lista);
        String[] values = {"Sexo", "Color de Ojos", "Tono de Piel"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>
                (getActivity(), android.R.layout.simple_list_item_1, android.R.id.text1, values);
        lista1.setAdapter(adapter);
        //-- registerFroContexmenu sirve para pasarle el menu2 a todos los elementos de la listview
        registerForContextMenu(lista1);
        //registerForContextMenu();
        return view;
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,
                                    ContextMenu.ContextMenuInfo menuInfo ) {


       int seleccionLista;

        if (v.getId() == (R.id.lista)) {
            seleccionLista = ((AdapterView.AdapterContextMenuInfo) menuInfo).position;
            menu.setHeaderTitle(lista1.getAdapter().getItem(seleccionLista).toString());
            MenuInflater inflater = getActivity().getMenuInflater();
            inflater.inflate(R.menu.menu_contextual_sexo, menu);

        } else
            menu.setHeaderTitle("Eliga su tipo de piel");
             MenuInflater inflater = getActivity().getMenuInflater();
        inflater.inflate(R.menu.menu_contextual_piel, menu);

            super.onCreateContextMenu(menu, v, menuInfo);
    }
    @Override
    public boolean onContextItemSelected(MenuItem item) {
        AdapterView.AdapterContextMenuInfo info = (AdapterView.AdapterContextMenuInfo) item.getMenuInfo();
        fotoPerfil=(ImageView) getView().findViewById(R.id.fotPerfil);

        switch (item.getItemId()) {
            case R.id.sexoF:
                //editNote(info.id);
                //Toast.makeText(getActivity(),"elegiste Femenino",Toast.LENGTH_SHORT).show();
               // fotoPerfil.setBackgroundResource(R.mipmap.ic_perfilf);
                fotoPerfil.setImageResource(R.mipmap.ic_perfilf);
               // Toast.makeText(getActivity(),lista1.getPositionForView(getView()),Toast.LENGTH_SHORT).show();
                return true;
            case R.id.sexoM:
                //deleteNote(info.id);
                //Toast.makeText(getActivity(),"elegiste Masculino",Toast.LENGTH_SHORT).show();
               // fotoPerfil.setBackgroundResource(R.mipmap.ic_perfilm);
                fotoPerfil.setImageResource(R.mipmap.ic_perfilm);
               // Toast.makeText(getActivity(),lista1.getPositionForView(getView()),Toast.LENGTH_SHORT).show();
                return true;
            case R.id.PMuyClara:
                    Toast.makeText(getActivity(),"elegiste Piel muyClara",Toast.LENGTH_SHORT).show();
            return  true;
            case R.id.Pclara:
                Toast.makeText(getActivity(),"elegiste Piel Clara",Toast.LENGTH_SHORT).show();
                return  true;
            case R.id.PMorenaClara:
                Toast.makeText(getActivity(),"elegiste Piel Morena Clara",Toast.LENGTH_SHORT).show();
                return  true;
            case R.id.PMorenaOscura:
                Toast.makeText(getActivity(),"elegiste Piel Morena Oscura",Toast.LENGTH_SHORT).show();
                return  true;
            case R.id.POscura:
                Toast.makeText(getActivity(),"elegiste Piel Oscura",Toast.LENGTH_SHORT).show();
                return  true;
            case R.id.PMuyOscura:
                Toast.makeText(getActivity(),"elegiste Piel Muy Oscura",Toast.LENGTH_SHORT).show();
                return  true;
                    default:
                return super.onContextItemSelected(item);
        }


    }
}
