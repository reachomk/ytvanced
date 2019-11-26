package defpackage;

import java.net.InetAddress;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: bbbg */
enum bbbg implements bbbd {
    ;

    private bbbg(String str) {
    }

    public final List a(String str) {
        return Collections.unmodifiableList(Arrays.asList(InetAddress.getAllByName(str)));
    }
}
