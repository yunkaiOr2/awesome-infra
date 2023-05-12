# rust 作为基础镜像
FROM rust:1.50

LABEL author="qguduemc@163.com"

COPY ~/.cargo/ ./rust

RUN rustup target add riscv64gc-unknown-none-elf && \
    cargo install cargo-binutils && \
    rustup component add llvm-tools-preview && \
    rustup component add rust-src



