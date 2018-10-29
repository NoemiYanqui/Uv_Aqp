package pe.edu.tecsup.uv_aqp;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

public class HomeFragment extends Fragment {

    private WebView webView;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

       // setContentView(R.layout.activity_webview);
        View view=inflater.inflate(R.layout.fragment_home,container,false);
        webView = (WebView) view.findViewById(R.id.Web);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("https://www.senamhi.gob.pe/mapas/mapadep/mapadepuv.php?dp=arequipa");
        return view;
    }
}
