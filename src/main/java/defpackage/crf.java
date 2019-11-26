package defpackage;

import com.facebook.litho.ComponentTree;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorCompletionService;

/* renamed from: crf */
public final class crf {
    private static final Map b = new HashMap();
    public final Set a;
    private final ExecutorCompletionService c;
    private final ExecutorCompletionService d;

    static boolean a(cmg cmg, List list, coz coz) {
        crf a = crf.a(cmg);
        int i = 0;
        if (a == null || (!cro.a() ? a.d == null : a.c == null)) {
            return false;
        }
        ExecutorCompletionService executorCompletionService = !cro.a() ? a.d : a.c;
        coz[] cozArr = new coz[list.size()];
        int size = list.size();
        for (int i2 = 1; i2 < size; i2++) {
            executorCompletionService.submit(new cre(cozArr, i2, coz, (cma) list.get(i2)), Integer.valueOf(i2 - 1));
        }
        cozArr[0] = crf.a(coz.b, (cma) list.get(0));
        int i3 = 0;
        while (i3 < size - 1) {
            try {
                executorCompletionService.take();
                i3++;
            } catch (InterruptedException e) {
                throw new RuntimeException("Could not execute split layout task", e);
            }
        }
        while (i < cozArr.length) {
            coz.a(cozArr[i]);
            i++;
        }
        return true;
    }

    public static coz a(cmg cmg, cma cma) {
        if (cma == null) {
            return cmg.a;
        }
        return cmg.a(cma);
    }

    public static crf a(cmg cmg) {
        ComponentTree componentTree = cmg.m;
        Object obj = componentTree != null ? componentTree.b : null;
        if (obj == null) {
            return null;
        }
        crf crf;
        synchronized ("SplitLayoutResolver.class") {
            crf = (crf) b.get(obj);
        }
        return crf;
    }
}
