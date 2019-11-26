package defpackage;

import java.io.File;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.concurrent.Callable;

/* renamed from: tve */
final class tve implements Callable {
    private final /* synthetic */ File a;
    private final /* synthetic */ tvc b;

    tve(tvc tvc, File file) {
        this.b = tvc;
        this.a = file;
    }

    public final /* synthetic */ Object call() {
        ubb ubb;
        int i;
        ubb ubb2;
        ubl a = ubl.a(this.a);
        ubn a2 = ubf.a(a);
        ubf.b(a2, a);
        ubb ubp = new ubp(a2.c);
        new bpj(uaz.a(a, a2)).a(ubp);
        ubb.a(ubp, a);
        PriorityQueue priorityQueue = new PriorityQueue(10, new ubc());
        r4 = new ubt[2];
        int i2 = 0;
        r4[0] = a2.b.b();
        r4[1] = a2.a.b();
        ubv ubv = new ubv(Arrays.asList(r4).iterator());
        while (ubv.a()) {
            ubb = (ubb) ubv.b();
            if (ubb.t instanceof ubp) {
                priorityQueue.offer(ubb);
                if (priorityQueue.size() > 10) {
                    priorityQueue.poll();
                }
            }
        }
        ArrayList arrayList = new ArrayList(priorityQueue);
        HashSet hashSet = new HashSet();
        ubw b = a2.b.b();
        while (b.a()) {
            Object obj = b.b;
            if ((obj instanceof ubg) && ((ubb) obj).a(a) > 10000) {
                hashSet.add((ubb) b.b);
            }
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        int size = arrayList.size();
        for (i = 0; i < size; i++) {
            arrayDeque.addLast((ubb) arrayList.get(i));
        }
        while (!arrayDeque.isEmpty()) {
            ubb = (ubb) arrayDeque.removeFirst();
            size = 0;
            for (ubb ubb3 : ubb.s) {
                int i3 = ubb3.r;
                double d = (double) i3;
                double d2 = (double) ubb.r;
                Double.isNaN(d2);
                if (d >= d2 * 0.75d || i3 >= 1048576) {
                    arrayDeque.addFirst(ubb3);
                    size++;
                }
            }
            if (size == 0) {
                hashSet.add(ubb);
            }
        }
        arrayList = new ArrayList(hashSet);
        ubu ubu = new ubu();
        i = arrayList.size();
        int i4 = 0;
        while (i4 < i) {
            ubb ubb4 = (ubb) arrayList.get(i4);
            ArrayDeque arrayDeque2 = new ArrayDeque();
            arrayDeque2.addLast(ubb4);
            ubb4.n = true;
            while (true) {
                size = i4 + 1;
                if (arrayDeque2.isEmpty()) {
                    break;
                }
                ubb4 = (ubb) arrayDeque2.removeFirst();
                if (ubf.a(ubb4)) {
                    ubu.a(ubb4.e(a), ubb4);
                }
                for (ubb addLast : ubb4.s) {
                    arrayDeque2.addLast(addLast);
                }
            }
            i4 = size;
        }
        ubi.a(a2.b, a2.a);
        ubi.a(a, a2.b, a2.a, ubi.a(a2.c), new ubk());
        ubi.a(a2.b, a2.a);
        i = arrayList.size();
        while (i2 < i) {
            ubb2 = (ubb) arrayList.get(i2);
            ArrayDeque arrayDeque3 = new ArrayDeque();
            arrayDeque3.addLast(ubb2);
            ubb2.n = true;
            while (true) {
                i4 = i2 + 1;
                if (arrayDeque3.isEmpty()) {
                    break;
                }
                ubb2 = (ubb) arrayDeque3.removeFirst();
                if (ubf.a(ubb2)) {
                    ubu.a(ubb2.e(a), ubb2);
                }
                for (ubb ubb32 : ubb2.m) {
                    if (!(ubb32 == null || ubb32.n)) {
                        ubb32.n = true;
                        arrayDeque3.addLast(ubb32);
                    }
                }
            }
            i2 = i4;
        }
        arrayList = new ArrayList();
        for (ubb ubb22 : a2.c) {
            if (ubb22 instanceof uax) {
                arrayList.add(ubb22);
            }
        }
        b = ubu.b();
        while (b.a()) {
            if (ubb.b((ubb) b.b)) {
                arrayList.add((ubb) b.b);
            }
        }
        return ubf.a(new ubn(a2.a, ubu, arrayList, a2.d), a);
    }
}
