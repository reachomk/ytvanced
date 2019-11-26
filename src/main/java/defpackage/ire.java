package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ire */
final /* synthetic */ class ire implements OnClickListener {
    private final iqu a;
    private final abnv b;

    ire(iqu iqu, abnv abnv) {
        this.a = iqu;
        this.b = abnv;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        iqu iqu = this.a;
        abnv abnv = this.b;
        iqu.aj.execute(new irk(iqu, abnv));
        List list = iqu.at.h;
        if (list != null) {
            list.remove(abnv);
        }
        isg isg = iqu.aD;
        isg.a.remove(abnv);
        isg.b.clear();
        ArrayList arrayList = isg.a;
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            int i5;
            if (arrayList.get(i4) instanceof abnv) {
                i5 = i2 + 1;
                int i6 = i3 + 1;
                isg.b.put(i2, i3);
                i2 = i5;
                i3 = i6;
            } else {
                i5 = i2 + 1;
                isg.b.put(i2, i3);
                i2 = i5;
            }
        }
        isg.notifyDataSetChanged();
    }
}
