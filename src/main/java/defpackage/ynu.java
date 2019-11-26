package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.libraries.youtube.conversation.ui.FacePileView;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ynu */
final /* synthetic */ class ynu implements yiq {
    private final yns a;

    ynu(yns yns) {
        this.a = yns;
    }

    public final void a(amul amul) {
        yns yns = this.a;
        ArrayList arrayList = new ArrayList(amul.size() - 1);
        amxn amxn = (amxn) amul.listIterator();
        zz zzVar = null;
        ykv ykv = null;
        ykv ykv2 = ykv;
        while (amxn.hasNext()) {
            ykv ykv3 = (ykv) amxn.next();
            if (ykv3.f()) {
                ykv = ykv3;
            } else {
                if (ykv2 == null) {
                    ykv2 = ykv3;
                }
                arrayList.add(ykv3.getName());
            }
        }
        if (!(amul.size() != 2 || ykv == null || ykv2 == null)) {
            zzVar = zz.a(ykv.getAvatar(), ykv2.getAvatar());
        }
        Context context = yns.e_;
        int size = arrayList.size();
        if (size != 0) {
            CharSequence string;
            List a;
            boolean z = false;
            if (size == 1) {
                string = context.getString(R.string.empty_chat_one_other_participant, new Object[]{arrayList.get(0)});
            } else if (size == 2) {
                string = context.getString(R.string.empty_chat_two_other_participants, new Object[]{arrayList.get(0), arrayList.get(1)});
            } else if (size != 3) {
                Object[] objArr = new Object[]{arrayList.get(0), arrayList.get(1), arrayList.get(2), Integer.valueOf(arrayList.size() - 3)};
                string = context.getResources().getQuantityString(R.plurals.empty_chat_four_or_more_other_participants, arrayList.size() - 3, objArr);
            } else {
                string = context.getString(R.string.empty_chat_three_other_participants, new Object[]{arrayList.get(0), arrayList.get(1), arrayList.get(2)});
            }
            ywx ywx = yns.f;
            FacePileView facePileView = ywx.b;
            if (zzVar != null) {
                a = amul.a((aygk) zzVar.a, (aygk) zzVar.b);
            } else {
                a = amul.g();
            }
            facePileView.a(a, ywx.d);
            View view = ywx.b;
            if (zzVar != null) {
                z = true;
            }
            xpr.a(view, z);
            xpr.a(ywx.c, string);
            xpr.a(ywx.a, true);
            return;
        }
        throw new IllegalArgumentException();
    }
}
