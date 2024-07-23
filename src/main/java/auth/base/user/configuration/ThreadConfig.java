package auth.base.user.configuration;

import auth.base.user.constant.AppConstant;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;

@Configuration
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ThreadConfig {
    @Value("${thread.pool.size:10}")
    int threadPoolSize;

    @Value("${thread.pool.queue.size:150}")
    int threadQueuePoolSize;

    @Bean(name = AppConstant.APP_THREAD_POOL_EXECUTOR)
    public Executor threadPoolTaskExecutor() {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(threadPoolSize);
        executor.setMaxPoolSize(threadPoolSize);
        executor.setQueueCapacity(threadQueuePoolSize);
        executor.setThreadNamePrefix("app-auth-invoke-");
        executor.initialize();
        return executor;
    }
}

