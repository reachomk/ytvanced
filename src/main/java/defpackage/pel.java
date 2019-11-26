package defpackage;

/* renamed from: pel */
public final class pel {
    public static peo A = peo.a("analytics.monitoring.sample_period_millis", 86400000, 86400000);
    public static peo B = peo.a("analytics.initialization_warning_threshold", 5000, 5000);
    public static peo a = peo.a("analytics.service_client_enabled", true, true);
    public static peo b = peo.a("analytics.log_tag", "GAv4", "GAv4-SVC");
    public static peo c = peo.a("analytics.local_dispatch_millis", 1800000, 120000);
    public static peo d = peo.a("analytics.initial_local_dispatch_millis", 5000, 5000);
    public static peo e = peo.a("analytics.dispatch_alarm_millis", 7200000, 7200000);
    public static peo f = peo.a("analytics.max_dispatch_alarm_millis", 32400000, 32400000);
    public static peo g = peo.a("analytics.max_hits_per_dispatch", 20, 20);
    public static peo h = peo.a("analytics.max_hits_per_batch", 20, 20);
    public static peo i;
    public static peo j;
    public static peo k;
    public static peo l;
    public static peo m = peo.a("analytics.max_get_length", 2036, 2036);
    public static peo n;
    public static peo o;
    public static peo p = peo.a("analytics.max_hit_length.k", 8192, 8192);
    public static peo q = peo.a("analytics.max_post_length.k", 8192, 8192);
    public static peo r = peo.a("analytics.max_batch_post_length", 8192, 8192);
    public static peo s;
    public static peo t = peo.a("analytics.batch_retry_interval.seconds.k", 3600, 3600);
    public static peo u = peo.a("analytics.http_connection.connect_timeout_millis", 60000, 60000);
    public static peo v = peo.a("analytics.http_connection.read_timeout_millis", 61000, 61000);
    public static peo w = peo.a("analytics.test.disable_receiver", false, false);
    public static peo x = peo.a("analytics.service_client.idle_disconnect_millis", 10000, 10000);
    public static peo y = peo.a("analytics.service_client.connect_timeout_millis", 5000, 5000);
    public static peo z = peo.a("analytics.service_client.reconnect_throttle_millis", 1800000, 1800000);

    static {
        peo.a("analytics.service_enabled", false, false);
        peo.a("analytics.max_tokens", 60, 60);
        Float valueOf = Float.valueOf(0.5f);
        peo peo = new peo(qol.a("analytics.tokens_per_sec", valueOf), valueOf);
        peo.a("analytics.max_stored_hits", 2000, 20000);
        peo.a("analytics.max_stored_hits_per_app", 2000, 2000);
        peo.a("analytics.max_stored_properties_per_app", 100, 100);
        peo.a("analytics.min_local_dispatch_millis", 120000, 120000);
        peo.a("analytics.max_local_dispatch_millis", 7200000, 7200000);
        String str = "http://www.google-analytics.com";
        i = peo.a("analytics.insecure_host", str, str);
        str = "https://ssl.google-analytics.com";
        j = peo.a("analytics.secure_host", str, str);
        str = "/collect";
        k = peo.a("analytics.simple_endpoint", str, str);
        str = "/batch";
        l = peo.a("analytics.batching_endpoint", str, str);
        str = "BATCH_BY_COUNT";
        n = peo.a("analytics.batching_strategy.k", str, str);
        str = "GZIP";
        o = peo.a("analytics.compression_strategy.k", str, str);
        peo.a("analytics.max_hits_per_request.k", 20, 20);
        String str2 = "404,502";
        s = peo.a("analytics.fallback_responses.k", str2, str2);
        peo.a("analytics.service_monitor_interval", 86400000, 86400000);
        peo.a("analytics.campaigns.time_limit", 86400000, 86400000);
        String str3 = "";
        peo.a("analytics.first_party_experiment_id", str3, str3);
        peo.a("analytics.first_party_experiment_variant", 0, 0);
        peo.a("analytics.service_client.second_connect_delay_millis", 5000, 5000);
        peo.a("analytics.service_client.unexpected_reconnect_millis", 60000, 60000);
    }
}
