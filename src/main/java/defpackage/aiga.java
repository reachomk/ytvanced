package defpackage;

import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.Context;
import android.widget.ArrayAdapter;
import com.google.android.youtube.R;
import java.util.List;

/* renamed from: aiga */
public final class aiga {
    private final Context a;
    private Dialog b;

    public aiga(Context context) {
        this.a = (Context) amqw.a((Object) context, (Object) "context cannot be null");
    }

    public final void a(List list, aigf aigf) {
        amqw.a((Object) aigf, (Object) "listener cannot be null");
        a();
        ArrayAdapter arrayAdapter = new ArrayAdapter(this.a, 17367057, list);
        this.b = new Builder(this.a).setTitle(R.string.subtitles).setSingleChoiceItems(arrayAdapter, 0, new aigd(arrayAdapter, aigf)).create();
        this.b.show();
    }

    public final void a() {
        Dialog dialog = this.b;
        if (dialog != null && dialog.isShowing()) {
            this.b.dismiss();
        }
        this.b = null;
    }
}
