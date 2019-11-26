package defpackage;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.ArrayList;

/* renamed from: ydm */
public final class ydm implements akot {
    public final View a;
    private final Handler b;
    private final ImageView c = ((ImageView) this.a.findViewById(R.id.illustration));
    private final TextView d = ((TextView) this.a.findViewById(R.id.text));
    private final akkq e;

    public ydm(Context context, Handler handler, akkq akkq) {
        this.a = View.inflate(context, R.layout.connection_shelf_empty, null);
        this.b = (Handler) amqw.a((Object) handler);
        this.e = (akkq) amqw.a((Object) akkq);
    }

    public final void a(akpb akpb) {
    }

    public final View K_() {
        return this.a;
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        aqim aqim = (aqim) obj;
        akkq akkq = this.e;
        ImageView imageView = this.c;
        aygk aygk = aqim.c;
        if (aygk == null) {
            aygk = aygk.f;
        }
        akkq.a(imageView, aygk);
        ArrayList arrayList = new ArrayList();
        for (arml a : aqim.b) {
            arrayList.add(ajqy.a(a));
        }
        this.d.setText(TextUtils.join(System.getProperty("line.separator"), arrayList));
        ydo ydo = (ydo) akor.a("ConnectionShelfEmptyParent");
        if (ydo == null || !ydo.b()) {
            this.a.setAlpha(1.0f);
            return;
        }
        this.a.setAlpha(0.0f);
        this.b.post(new ydl(this));
    }
}
