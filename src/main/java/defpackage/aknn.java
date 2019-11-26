package defpackage;

import android.content.Context;
import android.view.ViewGroup;

/* renamed from: aknn */
public final class aknn implements akox {
    private final Context a;
    private final amro b;
    private final akpb c;

    public aknn(Context context, amro amro, akpb akpb) {
        this.a = (Context) amqw.a((Object) context);
        this.b = (amro) amqw.a((Object) amro);
        this.c = (akpb) amqw.a((Object) akpb);
    }

    public final aknk a() {
        return new aknk(this.a, (akou) this.b.get(), this.c);
    }

    public final /* bridge */ /* synthetic */ akot a(ViewGroup viewGroup) {
        return a();
    }
}
