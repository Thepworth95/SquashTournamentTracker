import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { GroupFixturesComponent } from './group-fixtures.component';

describe('GroupFixturesComponent', () => {
  let component: GroupFixturesComponent;
  let fixture: ComponentFixture<GroupFixturesComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ GroupFixturesComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(GroupFixturesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
