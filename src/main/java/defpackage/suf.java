package defpackage;

import java.util.Map.Entry;

/* renamed from: suf */
final class suf implements bbnv {
    private final amur a;
    private final aztl b;

    public final /* synthetic */ Object a(Object obj) {
        amur amur = (amur) obj;
        aztk aztk = (aztk) aztl.b.createBuilder(this.b);
        amxo amxo = (amxo) ((amuw) amur.entrySet()).iterator();
        while (amxo.hasNext()) {
            Entry entry = (Entry) amxo.next();
            String str = (String) amqw.a((String) this.a.get(entry.getKey()));
            aztp aztp = (aztp) aztm.c.createBuilder();
            anvu a = anvu.a((byte[]) entry.getValue());
            aztp.copyOnWrite();
            aztm aztm = (aztm) aztp.instance;
            if (a != null) {
                aztm.a = 5;
                aztm.b = a;
                aztk.a(str, (aztm) ((anxl) aztp.build()));
            } else {
                throw new NullPointerException();
            }
        }
        return (aztl) ((anxl) aztk.build());
    }

    /* synthetic */ suf(amur amur, aztl aztl) {
        this.a = amur;
        this.b = aztl;
    }
}
