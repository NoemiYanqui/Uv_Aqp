package pe.edu.tecsup.uv_aqp;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class PerfilFragment extends Fragment  {


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
        registerForContextMenu(lista1);

        return view;
    }
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,
                                    ContextMenu.ContextMenuInfo menuInfo) {

        int seleccionLista;
        if(v.getId()==R.id.lista){
            seleccionLista=((AdapterView.AdapterContextMenuInfo)menuInfo).position;
            menu.setHeaderTitle(lista1.getAdapter().getItem(seleccionLista).toString());
            MenuInflater inflater = getActivity().getMenuInflater();
            inflater.inflate(R.menu.menu_contextual_sexo, menu);
        }
        super.onCreateContextMenu(menu, v, menuInfo);

    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        AdapterView.AdapterContextMenuInfo info = (AdapterView.AdapterContextMenuInfo) item.getMenuInfo();
        switch (item.getItemId()) {
            case R.id.sexoF:
                //editNote(info.id);
                Toast.makeText(getActivity(),"elegiste Femenino",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.sexoM:
                //deleteNote(info.id);
                Toast.makeText(getActivity(),"elegiste Masculino",Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onContextItemSelected(item);
        }
    }
}
