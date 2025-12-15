# Sử dụng hình ảnh Ubuntu làm nền tảng
FROM ubuntu:20.04

# Cài đặt SSH
RUN apt-get update && \
    apt-get install -y openssh-server && \
    apt-get clean

# Tạo thư mục cho SSH
RUN mkdir /var/run/sshd

# Thiết lập mật khẩu cho người dùng root
RUN echo 'root:password' | chpasswd

# Cho phép SSH kết nối
RUN sed -i 's/#PermitRootLogin prohibit-password/PermitRootLogin yes/' /etc/ssh/sshd_config

# Mở cổng SSH
EXPOSE 22

# Khởi động dịch vụ SSH
CMD ["/usr/sbin/sshd", "-D"]