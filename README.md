# LOAN PROJECT

### 도메인
#### 대출 상담 
![대출 상담 프로세스.png](imgs%2F%EB%8C%80%EC%B6%9C%20%EC%83%81%EB%8B%B4%20%ED%94%84%EB%A1%9C%EC%84%B8%EC%8A%A4.png)
- 대출 상담을 신청한다.

#### 대출 신청
![대출 신청 프로세스.png](imgs%2F%EB%8C%80%EC%B6%9C%20%EC%8B%A0%EC%B2%AD%20%ED%94%84%EB%A1%9C%EC%84%B8%EC%8A%A4.png)
- 대출 신청을 위한 약관 동의를 받는다.
- 대출 신청 정보를 입력한다.
- 대출 신청을 위한 입회 서류를 업로드할 수 있다.

#### 대출 심사
![대출 심사 프로세스.png](imgs%2F%EB%8C%80%EC%B6%9C%20%EC%8B%AC%EC%82%AC%20%ED%94%84%EB%A1%9C%EC%84%B8%EC%8A%A4.png)
- 대출 신청 정보를 기반으로 심사를 진행한다.
- 심사 결과에 따라 고객에게 결과를 알려준다.

#### 대출 집행
![대출 집행 프로세스.png](imgs%2F%EB%8C%80%EC%B6%9C%20%EC%A7%91%ED%96%89%20%ED%94%84%EB%A1%9C%EC%84%B8%EC%8A%A4.png)
- 대출 심사 조건을 고객이 수락한 이후 대출 계약을 마무리한다.
- 대출금을 고객에게 지급한다.
- 대출금 관리를 시작한다.

#### 대출 상환
![대출 상환 프로세스.png](imgs%2F%EB%8C%80%EC%B6%9C%20%EC%83%81%ED%99%98%20%ED%94%84%EB%A1%9C%EC%84%B8%EC%8A%A4.png)
- 대출금 집행 이후 고객은 정기적으로 **대출금과 이자**를 상환한다.
- 대출금 일부가 상환되는 경우 대출 계약에 잔여 대출금이 변경된다.
- 대출 상환 이력과 대출금 잔액 이력을 메일로 확인한다.

## 프로젝트 기술
- OpenJDK 17.0
- Spring boot 2.7.1
- MySQL 8.0
- Spring jpa
- Lombok
- Postman

## 대출 상담
```sql
create table counsel (
    counsel_id bigint not null auto_increment,
    created_at datetime default CURRENT_TIMESTAMP NOT NULL COMMENT '생성일자',
    is_deleted bit default false NOT NULL COMMENT '이용가능여부',
    updated_at datetime default CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP NOT NULL COMMENT '수정일자',
    address varchar(50) DEFAULT NULL COMMENT '주소',
    address_detail varchar(50) DEFAULT NULL COMMENT '상세주소',
    applied_at datetime COMMENT '신청일자' not null,
    cell_phone varchar(23) COMMENT '전화번호' not null,
    email varchar(50) DEFAULT NULL COMMENT '상담 요청자 이메일',
    memo text DEFAULT NULL COMMENT '상담메모',
    name varchar(12) COMMENT '상담 요청자' not null,
    zip_code varchar(5) DEFAULT NULL COMMENT '우편번호',
    primary key (counsel_id)
)
```