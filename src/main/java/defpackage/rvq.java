package defpackage;

import android.content.Context;
import android.os.Looper;

/* renamed from: rvq */
final class rvq extends psq {
    rvq() {
    }

    public final /* synthetic */ psw a(Context context, Looper looper, pyp pyp, Object obj, pte pte, pth pth) {
        obj = (rss) obj;
        pzr.a(obj, (Object) "Must provide valid PeopleOptions!");
        return new rum(context, looper, pte, pth, String.valueOf(obj.a), pyp);
    }
}
