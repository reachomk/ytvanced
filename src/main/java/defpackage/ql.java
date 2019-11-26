package defpackage;

import android.app.Notification.Builder;
import android.os.Bundle;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* renamed from: ql */
final class ql {
    public static SparseArray a(List list) {
        int size = list.size();
        SparseArray sparseArray = null;
        for (int i = 0; i < size; i++) {
            Bundle bundle = (Bundle) list.get(i);
            if (bundle != null) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                }
                sparseArray.put(i, bundle);
            }
        }
        return sparseArray;
    }

    public static Bundle a(Builder builder, qc qcVar) {
        builder.addAction(qcVar.g, qcVar.h, qcVar.i);
        Bundle bundle = new Bundle(qcVar.a);
        qt[] qtVarArr = qcVar.b;
        if (qtVarArr != null) {
            bundle.putParcelableArray("android.support.remoteInputs", ql.a(qtVarArr));
        }
        qtVarArr = qcVar.c;
        if (qtVarArr != null) {
            bundle.putParcelableArray("android.support.dataRemoteInputs", ql.a(qtVarArr));
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", qcVar.d);
        return bundle;
    }

    static Bundle a(qc qcVar) {
        Bundle bundle = new Bundle();
        bundle.putInt("icon", qcVar.g);
        bundle.putCharSequence("title", qcVar.h);
        bundle.putParcelable("actionIntent", qcVar.i);
        Bundle bundle2 = qcVar.a;
        if (bundle2 == null) {
            bundle2 = new Bundle();
        } else {
            bundle2 = new Bundle(bundle2);
        }
        bundle2.putBoolean("android.support.allowGeneratedReplies", qcVar.d);
        bundle.putBundle("extras", bundle2);
        bundle.putParcelableArray("remoteInputs", ql.a(qcVar.b));
        bundle.putBoolean("showsUserInterface", qcVar.e);
        bundle.putInt("semanticAction", 0);
        return bundle;
    }

    private static Bundle[] a(qt[] qtVarArr) {
        if (qtVarArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[qtVarArr.length];
        for (int i = 0; i < qtVarArr.length; i++) {
            qt qtVar = qtVarArr[i];
            Bundle bundle = new Bundle();
            bundle.putString("resultKey", qtVar.a);
            bundle.putCharSequence("label", qtVar.b);
            bundle.putCharSequenceArray("choices", qtVar.c);
            bundle.putBoolean("allowFreeFormInput", qtVar.d);
            bundle.putBundle("extras", qtVar.e);
            Set<String> set = qtVar.f;
            if (!(set == null || set.isEmpty())) {
                ArrayList arrayList = new ArrayList(set.size());
                for (String add : set) {
                    arrayList.add(add);
                }
                bundle.putStringArrayList("allowedDataTypes", arrayList);
            }
            bundleArr[i] = bundle;
        }
        return bundleArr;
    }

    static {
        Object obj = new Object();
        obj = new Object();
    }
}
