package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* renamed from: wvv */
final /* synthetic */ class wvv implements amro {
    private final Context a;
    private final bcaa b;
    private final bcaa c;

    wvv(Context context, bcaa bcaa, bcaa bcaa2) {
        this.a = context;
        this.b = bcaa;
        this.c = bcaa2;
    }

    public final Object get() {
        Context context = this.a;
        bcaa bcaa = this.b;
        bcaa bcaa2 = this.c;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new xbq("ScheduledTaskProto"));
        return new xml(new xms(new xbk(context, "com.google.android.libraries.youtube.common.task.ScheduledTaskStore", arrayList)), Executors.newScheduledThreadPool(1, new xaf("taskSched")), (xsc) bcaa.get(), (Executor) bcaa2.get());
    }
}
