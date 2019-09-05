#/usr/bin/env bash


# error message
err() {
  echo "[$(date +'%Y-%m-%dT%H:%M:%S%z')]: $@" >&2
}

# nice log message wrapper
log_date() {
    echo "[$(date +'%Y-%m-%dT%H:%M:%S%z')]: $@" >&1
}


set -ex


run_service(){
  log_date "i am starting env consul with these values"
  cd /opt/src
  envconsul -consul-addr=consul:8500 -prefix superservice java -jar target/app_java-0.0.1-SNAPSHOT.jar
}



if ! run_service; then
  err "failed to start service"
  exit 3
fi

