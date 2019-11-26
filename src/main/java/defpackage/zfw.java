package defpackage;

import android.content.Context;
import android.text.Spanned;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView.ScaleType;
import com.google.android.youtube.R;
import java.util.List;

/* renamed from: zfw */
public final class zfw extends BaseAdapter {
    private final Context a;
    private final List b;
    private final akkl c;

    public zfw(Context context, List list, akkl akkl) {
        this.a = (Context) amqw.a((Object) context);
        this.b = (List) amqw.a((Object) list);
        this.c = (akkl) amqw.a((Object) akkl);
    }

    public final long getItemId(int i) {
        return 0;
    }

    public final int getCount() {
        return this.b.size();
    }

    public final Object getItem(int i) {
        return this.b.get(i);
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        zfu zfu = view == null ? new zfu(this.a, this.c) : (zfu) view;
        Object obj = (aoym) getItem(i);
        if (!((aoym) amqw.a(obj)).equals(zfu.e)) {
            arml arml;
            zfu.e = obj;
            if ((obj.a & 1) != 0) {
                arml = obj.b;
                if (arml == null) {
                    arml = arml.f;
                }
            } else {
                arml = null;
            }
            Spanned a = ajqy.a(arml);
            zfu.b.setText(a);
            zfu.a.setContentDescription(a);
            zfu.a.setBackground(null);
            zfu.a.setBackgroundColor(zfu.getResources().getColor(R.color.background_secondary_dark));
            zfu.c.a();
            akle akle = zfu.c;
            aygk aygk = obj.c;
            if (aygk == null) {
                aygk = aygk.f;
            }
            akle.a(aygk, zfu.d);
            if ((obj.a & 2) == 0) {
                zfu.c.b(R.drawable.audio_swap_track_not_loaded);
            }
            zfu.c.a(ScaleType.CENTER_CROP);
        }
        return zfu;
    }
}
