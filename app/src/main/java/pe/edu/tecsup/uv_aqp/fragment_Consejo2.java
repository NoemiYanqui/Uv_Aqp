package pe.edu.tecsup.uv_aqp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class fragment_Consejo2 extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.activity_fragment__consejo3,container,false);
    }

    public void btnsiguiente_onclick (View v){
        Intent intentContactos = new Intent(v.getContext(),fragment_Consejo3.class);
        startActivity(intentContactos);

    }
}
