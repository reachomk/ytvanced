package defpackage;

import android.os.Handler;
import com.google.protos.youtube.api.innertube.LiveChatAction.AddChatItemAction;
import com.google.protos.youtube.api.innertube.LiveChatAction.AddLiveChatTextMessageFromTemplateAction;
import com.google.protos.youtube.api.innertube.LiveChatAction.AddLiveChatTickerItemAction;
import com.google.protos.youtube.api.innertube.LiveChatAction.MarkChatItemAsDeletedAction;
import com.google.protos.youtube.api.innertube.LiveChatAction.MarkChatItemsByAuthorAsDeletedAction;
import com.google.protos.youtube.api.innertube.LiveChatAction.RemoveChatItemAction;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Queue;

/* renamed from: abpd */
public class abpd extends abos {
    public final Handler c;
    public final Queue d = new ArrayDeque();
    public long e = 224;
    public long f;
    private long g;
    private final Runnable h = new abpc(this);

    public abpd(Handler handler, aboq aboq, abor abor) {
        super(aboq, abor);
        this.c = (Handler) amqw.a((Object) handler);
    }

    public void ah_() {
        this.g = 0;
    }

    public void aj_() {
        this.c.removeCallbacks(this.h);
        while (!this.d.isEmpty()) {
            a((abpf) this.d.remove());
        }
    }

    public void ak_() {
        this.c.removeCallbacks(this.h);
        this.d.clear();
    }

    public void a(apxu[] apxuArr, long j) {
        abov f = this.a.f();
        boolean z = false;
        if (f == null || f.d() != 0) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Object obj = null;
            for (anxp anxp : apxuArr) {
                anxr access$000 = anxl.checkIsLite(AddChatItemAction.addChatItemAction);
                anxp.a(access$000);
                anxr access$0002;
                Object b;
                if (anxp.h.a(access$000.d)) {
                    access$0002 = anxl.checkIsLite(AddChatItemAction.addChatItemAction);
                    anxp.a(access$0002);
                    b = anxp.h.b(access$0002.d);
                    if (b == null) {
                        obj = access$0002.b;
                    } else {
                        obj = access$0002.a(b);
                    }
                    AddChatItemAction addChatItemAction = (AddChatItemAction) obj;
                    if (addChatItemAction.c.isEmpty()) {
                        audp audp = addChatItemAction.b;
                        if (audp == null) {
                            audp = audp.c;
                        }
                        obj = abov.a(abov.a(audp));
                    } else {
                        obj = addChatItemAction.c;
                    }
                } else {
                    access$000 = anxl.checkIsLite(AddLiveChatTextMessageFromTemplateAction.addLiveChatTextMessageFromTemplateAction);
                    anxp.a(access$000);
                    if (!anxp.h.a(access$000.d)) {
                        access$000 = anxl.checkIsLite(RemoveChatItemAction.removeChatItemAction);
                        anxp.a(access$000);
                        if (anxp.h.a(access$000.d)) {
                            access$0002 = anxl.checkIsLite(RemoveChatItemAction.removeChatItemAction);
                            anxp.a(access$0002);
                            b = anxp.h.b(access$0002.d);
                            if (b == null) {
                                obj = access$0002.b;
                            } else {
                                obj = access$0002.a(b);
                            }
                            obj = ((RemoveChatItemAction) obj).b;
                        } else {
                            access$000 = anxl.checkIsLite(AddLiveChatTickerItemAction.addLiveChatTickerItemAction);
                            anxp.a(access$000);
                            if (anxp.h.a(access$000.d)) {
                                access$0002 = anxl.checkIsLite(AddLiveChatTickerItemAction.addLiveChatTickerItemAction);
                                anxp.a(access$0002);
                                b = anxp.h.b(access$0002.d);
                                if (b == null) {
                                    obj = access$0002.b;
                                } else {
                                    obj = access$0002.a(b);
                                }
                                augx augx = ((AddLiveChatTickerItemAction) obj).b;
                                if (augx == null) {
                                    augx = augx.c;
                                }
                                int i = augx.a;
                                obj = i == 132600952 ? ((augz) augx.b).b : i != 132600924 ? i != 201730354 ? null : ((augv) augx.b).b : ((auhb) augx.b).b;
                            } else {
                                access$000 = anxl.checkIsLite(MarkChatItemAsDeletedAction.markChatItemAsDeletedAction);
                                anxp.a(access$000);
                                if (anxp.h.a(access$000.d)) {
                                    access$0002 = anxl.checkIsLite(MarkChatItemAsDeletedAction.markChatItemAsDeletedAction);
                                    anxp.a(access$0002);
                                    b = anxp.h.b(access$0002.d);
                                    if (b == null) {
                                        obj = access$0002.b;
                                    } else {
                                        obj = access$0002.a(b);
                                    }
                                    obj = ((MarkChatItemAsDeletedAction) obj).d;
                                } else {
                                    access$000 = anxl.checkIsLite(MarkChatItemsByAuthorAsDeletedAction.markChatItemsByAuthorAsDeletedAction);
                                    anxp.a(access$000);
                                    boolean a = anxp.h.a(access$000.d);
                                }
                            }
                        }
                    }
                }
                abpf abpf = (abpf) linkedHashMap.get(obj);
                if (abpf == null) {
                    abpf = new abpf(new ArrayList());
                    linkedHashMap.put(obj, abpf);
                }
                abpf.a.add(anxp);
            }
            for (Entry value : linkedHashMap.entrySet()) {
                this.d.add((abpf) value.getValue());
            }
            if (j == 0) {
                j = 500;
            }
            int size = this.d.size();
            if (size > 0) {
                j = Math.max(1, ((j + 15) / ((long) size)) / 16);
                long min = Math.min(Math.max(7, j), 30);
                this.f = Math.max(1, (long) Math.ceil((double) (min / j)));
                this.e = min << 4;
                abor abor = this.a;
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis >= this.g) {
                    abpa h = abor.h();
                    if (h != null) {
                        if (j >= 14) {
                            z = true;
                        }
                        h.a(z);
                    }
                    this.g = currentTimeMillis + 60000;
                }
                if (size == linkedHashMap.size()) {
                    this.c.post(this.h);
                }
            }
            return;
        }
        this.b.a(apxuArr, this.a, false);
        f.b();
    }

    public final void a(abpf abpf) {
        apxu[] apxuArr = new apxu[abpf.a.size()];
        abpf.a.toArray(apxuArr);
        this.b.a(apxuArr, this.a, true);
    }
}
