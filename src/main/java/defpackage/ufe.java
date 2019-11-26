package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: ufe */
public abstract class ufe extends nd {
    public ListAdapter aq;

    public abstract int W();

    public abstract String X();

    public abstract OnItemClickListener Y();

    public abstract ListAdapter Z();

    public void b(Bundle bundle) {
        super.b(bundle);
        a(1, 0);
    }

    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate;
        this.aq = Z();
        int W = W();
        if (W == 0) {
            inflate = layoutInflater.inflate(R.layout.bottom_sheet_list_fragment, viewGroup, false);
            ListView listView = (ListView) inflate.findViewById(R.id.bottom_sheet_list_view);
            listView.setAdapter(this.aq);
            listView.setOnItemClickListener(Y());
        } else if (W == 1) {
            inflate = layoutInflater.inflate(R.layout.bottom_sheet_grid_fragment, viewGroup, false);
            GridView gridView = (GridView) inflate.findViewById(R.id.bottom_sheet_grid_view);
            gridView.setAdapter(this.aq);
            gridView.setOnItemClickListener(Y());
        } else if (W == 2) {
            inflate = layoutInflater.inflate(R.layout.bottom_sheet_dialog_fragment, viewGroup, false);
        } else {
            int W2 = W();
            StringBuilder stringBuilder = new StringBuilder(36);
            stringBuilder.append("Unsupported layout type: ");
            stringBuilder.append(W2);
            throw new IllegalStateException(stringBuilder.toString());
        }
        String X = X();
        TextView textView = (TextView) inflate.findViewById(R.id.bottom_sheet_title);
        if (TextUtils.isEmpty(X)) {
            textView.setVisibility(8);
        } else {
            textView.setText(X);
            textView.setVisibility(0);
        }
        return inflate;
    }

    public void W_() {
        super.W_();
        Window window = this.c.getWindow();
        int i = -1;
        if (W() == 2 && ufe.b(p()) > 600) {
            i = -2;
        }
        window.setLayout(i, -2);
        this.c.getWindow().setBackgroundDrawableResource(17170443);
        this.c.getWindow().setGravity(81);
        this.c.getWindow().setWindowAnimations(R.style.SlideUpDownAnimation);
    }

    public static int b(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return (int) (((float) displayMetrics.widthPixels) / displayMetrics.density);
    }
}
